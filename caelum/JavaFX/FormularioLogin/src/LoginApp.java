import javafx.scene.control.Button;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class LoginApp extends Application{

	@Override
	public void start(Stage stage) throws Exception {
	
		// Criação do painel:
		AnchorPane painel = new AnchorPane();
		painel.setPrefSize(400,300);
		
		// Criação da cena:
		Scene cena = new Scene(painel);
		
		
		// Montando formulário:
		TextField txLogin = new TextField();
		txLogin.setPromptText("Digite seu login: ");
		
		PasswordField txSenha = new PasswordField();
		txSenha.setPromptText("Digite sua senha");
		
		Button btEntrar 		= 	new Button("Entrar");
		Button btSair 			=	new Button("Sair");
		
		painel.getChildren().addAll(txLogin, txSenha, btEntrar, btSair );
		
		
		// Indicação da cena em Stage:
		stage.setScene(cena);
		stage.show();

		/**
		 * Organizando os nodes:
		 * Subtraindo a largura da tela pela largura do 
		 * componente e dividindo por 2 para achar o centro da tela 
		 */
		txLogin.setLayoutX((painel.getWidth() - txLogin.getWidth()) / 2);
		txLogin.setLayoutY(50);
		txSenha.setLayoutX((painel.getWidth() - txSenha.getWidth()) / 2);
		txSenha.setLayoutY(100);
		btEntrar.setLayoutX((painel.getWidth() - btEntrar.getWidth()) / 2);
		btEntrar.setLayoutY(150);
		btSair.setLayoutX((painel.getWidth() - btSair.getWidth()) / 2);
		btSair.setLayoutY(200);
		
		// CSS:
		painel.setStyle("-fx-background-color: linear-gradient("
				+ "from 0% 0% to 100% 100%, blue 0%, silver 100%);");
		
		
		
		
	}
	
	
	
}


