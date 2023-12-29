/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Stef
 */
module project_maswiv {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens project_maswiv to javafx.fxml;
    exports project_maswiv;
}
