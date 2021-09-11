module it.stdev.sideMenuAppJavaFx {
	
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens it.stdev.sideMenuAppJavaFx to javafx.fxml;
    exports it.stdev.sideMenuAppJavaFx;
}
