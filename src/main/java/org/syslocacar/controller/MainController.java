package org.syslocacar.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import org.syslocacar.utils.Alerta;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private ScrollPane scrollPaneMain;

    @FXML
    private VBox vBoxMain;

    @FXML
    private MenuBar menuBarMain;

    @FXML
    private Menu menuCadastro;

    @FXML
    private Menu menuRelatorio;

    @FXML
    private Menu menuHelp;

    @FXML
    private MenuItem menuItemVeiculo;

    @FXML
    private MenuItem menuItemLocacao;

    @FXML
    private MenuItem menuItemRelatorioLocacao;

    @FXML
    private MenuItem menuItemSobre;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void onCadastroVeiculoAction() {
        System.out.println("Cadastro Veiculo");
    }

    @FXML
    public void onCadastroLocacaoAction() {
        System.out.println("Cadastro Locação");
    }

    @FXML
    public void onRelatorioLocacaoAction() {
        System.out.println("Relatório Veículo");
    }

    @FXML
    public void onHelpAboutAction() {
        Alerta.exibirAlerta("SysLocaCar", "About", "SysLocaCar versão 1.0", Alert.AlertType.INFORMATION);
    }
}
