/**
 * Sample Skeleton for 'FrmMainPage.fxml' Controller Class
 */

package it.stdev.sideMenuAppJavaFx;

import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

public class FrmMainPageController {

	private Set<HBox> menuItems = new HashSet<HBox>();

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="hboxDashBoard"
	private HBox hboxDashBoard; // Value injected by FXMLLoader

	@FXML // fx:id="hboxBatchAnalysis"
	private HBox hboxBatchAnalysis; // Value injected by FXMLLoader

	@FXML // fx:id="hboxCwPdfCheck"
	private HBox hboxCwPdfCheck; // Value injected by FXMLLoader

	@FXML // fx:id="hboxSettings"
	private HBox hboxSettings; // Value injected by FXMLLoader

	@FXML
	void doBatchAnalysis(MouseEvent event) {
		this.selectNewMenuButton(this.hboxBatchAnalysis);
	}

	@FXML
	void doCwPdfCheck(MouseEvent event) {
		this.selectNewMenuButton(this.hboxCwPdfCheck);
	}

	@FXML
	void doDashBoard(MouseEvent event) {
		this.selectNewMenuButton(this.hboxDashBoard);
	}

	@FXML
	void doSettings(MouseEvent event) {
		this.selectNewMenuButton(this.hboxSettings);

	}

	private void selectNewMenuButton(HBox selectedHB) {
		for (HBox hb : menuItems) {
			hb.setStyle("-fx-border-color: #0078D7;" + "-fx-border-width: 0px 0px 0px 0px;");

		}
		selectedHB.setStyle("-fx-border-color: #0078D7;" + "-fx-border-width: 0px 0px 0px 4px;");

	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert hboxDashBoard != null
				: "fx:id=\"hboxDashBoard\" was not injected: check your FXML file 'FrmMainPage.fxml'.";
		assert hboxBatchAnalysis != null
				: "fx:id=\"hboxBatchAnalysis\" was not injected: check your FXML file 'FrmMainPage.fxml'.";
		assert hboxCwPdfCheck != null
				: "fx:id=\"hboxCwPdfCheck\" was not injected: check your FXML file 'FrmMainPage.fxml'.";
		assert hboxSettings != null
				: "fx:id=\"hboxSettings\" was not injected: check your FXML file 'FrmMainPage.fxml'.";

		this.menuItems.add(hboxDashBoard);
		this.menuItems.add(hboxBatchAnalysis);
		this.menuItems.add(hboxCwPdfCheck);
		this.menuItems.add(hboxSettings);

		hboxDashBoard.setStyle("-fx-border-color: #0078D7;" + "-fx-border-width: 0px 0px 0px 4px;");

	}

}
