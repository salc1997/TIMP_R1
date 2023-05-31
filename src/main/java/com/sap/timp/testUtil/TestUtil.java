package com.sap.timp.testUtil;

	import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.prefs.Preferences;

import org.openqa.selenium.WebElement;


	public class TestUtil{

		public static long PAGE_LOAD_TIMEOUT = 300;
		public static long IMPLICIT_WAIT = 30;

		public static final String ACCOUNTS_SAVE_CHANGES_SUCCESS_MSG = "undefined was successfully Updated! click 'OK' Button to continue";
		public static final String CREATE_APP_KEY_DISCLAIMER = "*Disclaimer: Once the dialog is closed you will not be able to see the SECRET, to display it again you will need to regenerate the App Key*.";
		public static final String SEND_SMS_SELECT_ORIGIN_NUMBER_DESCRIPTION="Select the LiveLink Number you will send a message from. You can use one default number from Live Link or select a number from the list.";
		public static final String SEND_SMS_SELECT_DESTINATION_NUMBER_DESCRIPTION="Enter the number you will send a message to";
		public static final String SEND_SMS_MESSAGE_BODY_DESCRIPTION="Type in the body of the message you would like to send";
		public static final String LANGUAGE_CODE_SAMPLE_DESCRIPTION="Here is the code needed to send your message in several languages. You can copy and paste this code into your application to send a message. See our Tutorial section for more detailed examples and explanations.";
		public static final String SEND_SMS_SAMPLE_CODE_API_URL="\"https://livelink.sapmobileservices.com/api/v2/sms\"";
		public static final String REVIEW_AND_SEND_SMS_DESCRIPTION="Test your Number by sending your first SMS message with Live Link 365. You can edit your Account Setting or Manage your Numbers anytime from the left panel.";
		public static final String SEND_SMS_SUCCESS_MSG="The SMS was successfully sent from Live Link";
		public static final String GENERATE_2FA_TOKEN_SUCCESS_MSG="The SMS containing the Token was successfully sent. This is your OTP";
		public static final String VALIDATE_2FA_TOKEN_SUCCESS_MSG="Token Validated Successfully";
		public static final String REGISTER_EMAIL_SOFTTOKEN_SUCCESS_MSG="Your user has been registered successfully.";
		public static final String SCAN_QR_CODE_DESCRIPTION="Scan the following QR Code with the Google Authenticator app in order to retrieve soft tokens for the previously registered account.";
		public static final String VALIDATE_QR_CODE_SUCCESS_MSG="Code Validated Successfully.";
		public static final String SEND_EMAIL_DESCRIPTION="Enter an email address and a message you wish to send. Your email will be sent from an SAP Digital Interconnect demo account. If you do not receive the email, please check your spam folder. This tool supports text-only email. The Live Link email API will additionally support emails with an HTML template.";
		public static final String SEND_EMAIL_SUCCESS_MSG="The email was successfully sent from Live Link.";
		
		

		@SuppressWarnings("deprecation")
		public static String randomf() {
			Random r = new Random();
			int num = r.nextInt(300);
			Date d = new Date();
			return String.valueOf(num) + "_" + d.getDate() + d.getYear();
		}

		public static String randomSAPUserID() {
			Random r = new Random();
			int num = r.nextInt(899999) + 100000;
			String sapUserID = "T" + String.valueOf(num);
			System.out.println("random SAP User ID is: " + sapUserID);
			return sapUserID;
		}
		
		public static String randomSmallNumber() {
			Random r = new Random();
			int num = r.nextInt(899) + 100;
			String sapUserID = String.valueOf(num);
			return sapUserID;
		}

		public static String randomName() {
			Random r = new Random(); // just create one and keep it around
			String alphabet = "abcdefghijklmnopqrstuvwxyz";

			final int N = 7;
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < N; i++) {
				sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
			}
			String randomName = sb.toString();
			System.out.println(randomName);
			return randomName;
		}
		/*
		public static String getAbsoluteXPath(WebElement element){
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			   return (String) (js).executeScript(
			    	"function absoluteXPath(element) {"+
					  "var comp, comps = [];"+
						"var parent = null;"+
						"var xpath = '';"+
						"var getPos = function(element) {"+
						"var position = 1, curNode;"+
						"if (element.nodeType == Node.ATTRIBUTE_NODE) {"+
						"return null;"+
						"}"+
						"for (curNode = element.previousSibling; curNode; curNode = curNode.previousSibling) {"+
							"if (curNode.nodeName == element.nodeName) {"+
								"++position;"+
							"}"+
						"}"+
						"return position;"+
						"};"+

						"if (element instanceof Document) {"+
							"return '/';"+
						"}"+

						"for (; element && !(element instanceof Document); element = element.nodeType == Node.ATTRIBUTE_NODE ? element.ownerElement : element.parentNode) {"+
						"comp = comps[comps.length] = {};"+
						"switch (element.nodeType) {"+
						"case Node.TEXT_NODE:"+
							"comp.name = 'text()';"+
							"break;"+
						"case Node.ATTRIBUTE_NODE:"+
							"comp.name = '@' + element.nodeName;"+
							"break;"+
						"case Node.PROCESSING_INSTRUCTION_NODE:"+
							"comp.name = 'processing-instruction()';"+
							"break;"+
						"case Node.COMMENT_NODE:"+
							"comp.name = 'comment()';"+
							"break;"+
						"case Node.ELEMENT_NODE:"+
							"comp.name = element.nodeName;"+
							"break;"+
						"}"+
						"comp.position = getPos(element);"+
						"}"+

						"for (var i = comps.length - 1; i >= 0; i--) {"+
							"comp = comps[i];"+
							"xpath += '/' + comp.name.toLowerCase();"+
							"if (comp.position !== null) {"+
							"xpath += '[' + comp.position + ']';"+
							"}"+
						"}"+
						"return xpath;"+

					"} return absoluteXPath(arguments[0]);", element);
				}
		*/
		public static String extractTRNumberXpath(String fullString) {
			String partialString = fullString.substring(fullString.indexOf("tr["), fullString.length());
			String number = partialString.substring(partialString.lastIndexOf("tr[") + 3, partialString.indexOf("]"));
			return number;
		}


		public static String getContractEffectiveDate() {
			Calendar calendar = Calendar.getInstance();
			Date today = calendar.getTime();
			System.out.println("today: " + today);
			calendar.add(Calendar.DAY_OF_YEAR, 2);
			Date tomo = calendar.getTime();
			SimpleDateFormat formater = new SimpleDateFormat("MMM dd, yyyy");
			String tomorrow = formater.format(tomo);
			System.out.println("Tommorow is : " + tomorrow);
			return tomorrow;
		}
		/*
		public static String getEnvironment() throws MalformedURLException {
			URL url = new URL(prop.getProperty("url"));
			String hostname = url.getHost();
			String env = null;
			if (hostname.equals("livelink.sapmobileservices.com")) {
				env = "PROD";
			} else if (hostname.equals("demo-livelink.sapmobileservices.com")) {
				env = "DEMO";
			} else if (hostname.equals("llbpal55.pal.sap.corp")) {
				env = "QAS";
			} else {
				System.out.println("Please specify the correct environment");
			}
			return env;

		}
		
	*/
		
		public String fechaPasadoManana() {

			Date fecha = new Date();

			Date ayer = new Date(fecha.getTime() + TimeUnit.DAYS.toMillis(+2));

			SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");

			return df.format(ayer);

		}
		
		// funcion para vaidar que la fecha de detalle tenga el formato de DD/MM/YY
		public boolean validarFecha(String fecha) {
			try {
				SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
				formatoFecha.setLenient(false);
				formatoFecha.parse(fecha);
			} catch (ParseException e) {
				return false;
			}
			return true;
		}
		
		public void sleep(int miliSeconds) {
			try {
				Thread.sleep(miliSeconds);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		public Boolean igualInt(int valor, int esperado) {

			boolean sucesso = false;
			if (valor == esperado) {
				sucesso = true;
			} else {
				sucesso = false;
			}

			return sucesso;
		}

		public Boolean igualDobule(double valor, double esperado) {

			boolean sucesso = false;
			if (valor == esperado) {
				sucesso = true;
			} else {
				sucesso = false;
			}

			return sucesso;
		}

		public Boolean diferenteDe(double valor, double esperado) {

			boolean sucesso = false;
			if (valor != esperado) {
				sucesso = true;
			} else {
				sucesso = false;
			}

			return sucesso;
		}

		public boolean isNum(String strNum) {
			boolean ret = true;
			try {

				Double.parseDouble(strNum);

			} catch (NumberFormatException e) {
				ret = false;
			}
			return ret;
		}

		public Boolean mayorQue(double mayor, double menor) {

			boolean sucesso = false;
			if (mayor > menor) {
				sucesso = true;
			} else {
				sucesso = false;
			}

			return sucesso;
		}

		public Boolean menorQue(double mayor, double menor) {

			boolean sucesso = false;
			if (menor < mayor) {
				sucesso = true;
			} else {
				sucesso = false;
			}

			return sucesso;
		}
		
		public String fechaActual() {

			Date fecha = new Date();

			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

			return df.format(fecha);

		}

		public String fechaAyer() {

			Date fecha = new Date();

			Date ayer = new Date(fecha.getTime() + TimeUnit.DAYS.toMillis(-1));

			SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");

			return df.format(ayer);

		}

		public String fechaManana() {

			Date fecha = new Date();

			Date ayer = new Date(fecha.getTime() + TimeUnit.DAYS.toMillis(+1));

			SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");

			return df.format(ayer);

		}

		public Double convertToDouble(String numero) {

			Double result = new Double(numero);

			return result;

		}
		
		public int convertToInt(String numero) {

			int result = new Integer(numero);

			return result;

		}
		
		public String remplazarPuntos(String valor) {

			valor = valor.replace(".", "");

			return valor;

		}

		public String remplazarComas(String valor) {

			valor = valor.replace(",", ".");

			return valor;

		}

		public String formatear(String valor) {

			valor = valor.replace(".", "");
			valor = valor.replace(",", ".");

			return valor;
		}
		
		public Integer contarWebElementsList(List<WebElement> colunas) {

			int contar = -1;

			if (colunas.size() > 0) {

				for (int i = 0; i < colunas.size(); i++) {
					contar = contar + 1;
				}
			} else {
				contar = 0;
			}

			return contar;

		}

		public void idInserir(String nome, String idRegistro) {
			Preferences id = Preferences.userRoot();

			id.put(nome, idRegistro);

		}

		public String idObter(String nome) {

			Preferences id = Preferences.userRoot();

			long idRegistro = id.getLong(nome, 1);

			String idReturn = String.valueOf(idRegistro);

			return idReturn;

		}
		
		public String ordenar(String dato) {

			String recorrer = dato;

			String[] recorrer2 = recorrer.split("");

			Arrays.sort(recorrer2);

			String sorted = "";

			for (int i = 0; i < recorrer2.length; i++) {

				sorted += recorrer2[i];

			}

			return sorted;
		}
		
		public String capitalize(String cadena) {
			String[] split = cadena.split("");
			for (int i = 0; i < split.length; i++) {
				if (i == 0 || split[i - 1].equals(" ")) {
					split[i] = split[i].toUpperCase();
				}
			}

			return String.join("", split);
		}

		public String mesActual() {
			// Obtienes el mes actual
			Month mes = LocalDate.now().getMonth();

			// Obtienes el nombre del mes
			String nombreMes = mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
			nombreMes = capitalize(nombreMes);

			return nombreMes;
		}

		public String anioActual() {
			// Obtienes el mes actual
			int anio = LocalDate.now().getYear();

			String anioString = String.valueOf(anio);
			return anioString;
		}

		public String dataanterior() {

			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DAY_OF_MONTH, -1);

			return df.format(cal.getTime());

		}
		
		public String diaHoy() {
			Calendar c1 = Calendar.getInstance();
			Calendar c2 = new GregorianCalendar();
			
			String dia = Integer.toString(c2.get(Calendar.DATE));
			

			return dia;

		}
		
		public String diaActual() {
			// Obtienes el mes actual
			int anio = LocalDate.now().getDayOfMonth();
			
			String anioString = String.valueOf(anio);
			return anioString;
		}
		
		public String diaDespues() {
			DateFormat df = new SimpleDateFormat ("dd");
			Calendar cal = Calendar.getInstance();
			cal.add (Calendar.DATE, +1);
			
			return df.format(cal.getTime());
		}
		
		
		public String getCodeMonthByMonth(String mes){
		    Hashtable<String, String> meses = new Hashtable<String, String>();
	        meses.put("Janeiro","01");
	        meses.put("Fevereiro","02");
	        meses.put("Março","03");
	        meses.put("Abril","04");
	        meses.put("Maio","05");
	        meses.put("Junho","06");
	        meses.put("Julho","07");
	        meses.put("Agosto","08");
	        meses.put("Setembro","09");
	        meses.put("Outubro","10");
	        meses.put("Novembro","11");
	        meses.put("Dezembro","12");
	        return meses.get(mes);
		}
		
		
		// BRB
		public String elementosDiferentes = "Os elementos nao sao iguais";
		public String comentariosInativos = "Os coment�rios nao foram ativados";
		public String correcaoInativa = "A correcao nao foi ativada";
		public String semAcesso = "Nao foi possivel aceder ao aplicativo";
		public String semCampoOutput = "O campo output nao foi adicionado";
		public String comentarioNaoValido = "Os comentarios nao foram os ingresados";
		public String crescenteEDecrescente = "Os resultados nao est�o em uma ordem valida";
		public String copiaNaoCriada = "A copia nao foi criada com sucesso";
		public String editado = "O relatorio n�o foi modificado com sucesso";
		public String eliminar = "O elemento n�o foi deletado";
		public String deletarColuna = "A coluna n�o foi deletada";
		public String exportacao = "A exporta��o n�o foi realizada com sucesso";
		public String filtros = "Os resultados do filtro n�o s�o iguais";
		public String aplicacaoFiltros = "Os filtros n�o foram aplicados com sucesso";
		public String formatacao = "A formata��o n�o foi aplicada";
		public String excluirVariante = "A variante n�o foi excluida";
		public String salvarVariante = "A variante n�o foi salvada com sucesso";
		public String formula = "Os valores n�o s�o iguais";
		public String gruposAvan = "Os resultados n�o s�o iguais";
		public String gruposAvanDif = "Os resultados n�o s�o diferentes";
		public String gruposAvanDel = "Os grupos n�o foram deletados";
		public String ListaSuspensa = "Os coment�rios n�o foram inseridos";
		public String novoRelatorio = "O novo relat�rio n�o foi criado";
		public String colunas = "As colunas n�o foram inseridas";
		public String paginaSeguiente = "N�o se conseguiu avan�ar para a p�gina seguiente";
		public String paginaAnterior = "N�o se conseguiu avan�ar para a p�gina anterior";
		public String paginaFinal = "N�o se conseguiu avan�ar para a �ltima p�gina";
		public String paginaInicial = "N�o se conseguiu avan�ar para a p�gina inicial";
		public String paginaInserida = "N�o foi possiv�l ava�ar para a p�gina inserida";
		public String visualizar = "O modo visualiza��o n�o est� ativado";
		public String compartilharE = "N�o foi possiv�l compartilhar o relat�rio desde o editor";
		public String descompartilharE = "N�o foi possiv�l descompartilhar o relat�rio desde o editor";
		public String compartilharB = "N�o foi possiv�l compartilhar o relat�rio desde a biblioteca";
		public String descompartilharB = "N�o foi possiv�l compartilhar o relat�rio desde a biblioteca";
		public String renomear = "A coluna n�o foi renomeada com sucesso";
		public String reordenar = "A coluna n�o foi reordenada com sucesso";

		// MDR
		public String Editar = "O valor do campo n�o foi editado";
		public String EmpresaVisualizar = "N�o foi possiv�l visalizar o registro";
		public String Filtros = "Os resultados n�o s�o acorde aos filtros";
		public String Criar = "O registro n�o foi criado com sucesso";
		public String Eliminado = "O registro n�o foi eliminado com sucesso";
		public String Detalhes = "As informa��es n�o s�o as esperadas";

		public String Atualizar = "N�o foi possivel atualizar os registros";
		public String Favoritos = "N�o foi possivel mandar o registro para favoritos";
		public String Ingresar = "Error ao tentar ingresar";

		// BCB
		public String subniveis = "Os Subniveis n�o foram adicinados com sucesso";
		public String Acessar = "Erro ao tentar acessar ao componente";

		public String Restaurar = "O registro n�o foi restaurado com sucesso";


}



