
public class TestaSwitch {

	public static void main(String[] args) {

		int mes = 10;
		String mensagem = "O mês é ";

		switch (mes) {
		case 1:
			System.out.println(mensagem + "Janeiro");
			break;
		case 2:
			System.out.println(mensagem + "Fevereiro");
			break;
		case 3:
			System.out.println(mensagem + "Março");
			break;
		case 4:
			System.out.println(mensagem + "Abril");
			break;
		case 5:
			System.out.println(mensagem + "Maio");
			break;
		case 6:
			System.out.println(mensagem + "Junho");
			break;
		case 7:
			System.out.println(mensagem + "Julho");
			break;
		case 8:
			System.out.println(mensagem + "Agosto");
			break;
		case 9:
			System.out.println(mensagem + "Setembro");
			break;
		case 10:
			System.out.println(mensagem + "Outubro");
			break;
		case 11:
			System.out.println(mensagem + "Novembro");
			break;
		case 12:
			System.out.println(mensagem + "Dezembro");
			break;
		default:
			System.out.println("Mês inválido");
			break;
		}

	}
}
