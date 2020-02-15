
public class AliquotaComIfs {

	public static void main(String[] args) {
		
		double salario = 3300.0;
		
		double irRetencao7 = 0.075;
		double irRetencao15 = 0.150;
		double irRetencao22 = 0.225;
		double deducaoRetencao7 = 142.0;
		double deducaoRetencao15 = 350.0;
		double deducaoRetencao22 = 636.0;
		double calculoDoImposto;
		String mensagemImposto = "O imposto devido é de: ";
		
		// double teste = salario * irRetencao7;
		// System.out.println(teste);
				
		if (salario <= 1899) {
			System.out.println("Faixa isenta");
		}else {
			if(salario >= 1900 && salario <= 2800) {
				calculoDoImposto = salario * irRetencao7 - deducaoRetencao7; 
				System.out.println(mensagemImposto + calculoDoImposto);
			}else {
			if(salario >= 2800.01 && salario <= 3751.0) {
				calculoDoImposto = salario * irRetencao15 - deducaoRetencao15;
				System.out.println(mensagemImposto + calculoDoImposto);
			}else {
				if (salario >= 3751.01 && salario <= 4664.0) {
					calculoDoImposto = salario * irRetencao22 - deducaoRetencao22;
					System.out.println(mensagemImposto + calculoDoImposto);
				}else {
					if (salario >= 4664.1) {
						System.out.println("Faixa de remuneração não se enquadra ao imposto de Renda");
					}
				}
			}
		}
		}}
	}

