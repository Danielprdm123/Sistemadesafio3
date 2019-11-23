package br.com.hospitalif.report;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JFrame;

import br.com.hospitalif.conexao.Conexao;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.swing.JRViewer;
public class PrintReport extends JFrame {
	public void showReport(String relatorio) throws JRException, ClassNotFoundException, SQLException {
		String reportSrcFile = "resource/report/" + relatorio;
		// Compilar o arquivo jrxml
		JasperReport jasperReport = JasperCompileManager.compileReport(reportSrcFile);
		// Colocar os parâmetros em uma Collection caso precise
		HashMap<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("","");
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		list.add(parameters);
		JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(list);
		JasperPrint print = JasperFillManager.fillReport(jasperReport, null, new Conexao().getConnection() );
		JRViewer viewer = new JRViewer(print);
		viewer.setOpaque(true);
		viewer.setVisible(true);
		this.add(viewer);
		this.setSize(700, 500);
		this.setVisible(true);
		System.out.print("Relatório Gerado!");
	}
}
