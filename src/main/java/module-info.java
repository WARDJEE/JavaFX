module hello {
    requires javafx.controls;
    requires freetts;
    requires java.management;
    requires java.sql;
    requires org.hsqldb;
    // Change to package where you want to run a main
    exports week06;
}