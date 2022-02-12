import java.util.Scanner;
public class AP1_LP {

	public static void main(String[] args) {
		
		System.out.println("\n" + "********** Programinha em Java para cálculo de compras de um Mercadinho ************" + "\n");
		System.out.println("Criado por: Breno Yuri Freire de Brito"	+ "\n" + "Matrícula: 1-2020218743");
		System.out.println("Curso Sistemas de Informação da Unifametro"	+ "\n" + "Professor: Leonardo" + "\n");
		
		//Input do Usuário
				Scanner leitor = new Scanner(System.in);
				
				//Variável Sessão, usada para Perguntar ao usuário, qual a sessão alimentícia desejada.
				int SessAli;
				
				//Variáveis Sessão Padaria:
				int produtoPad;
				int produtoPadQtd;
				double paoFranc = 0.50;
				double paoQueij = 0.75;
				double produtoPadQtdTotal;
				
				//Variáveis Sessão Frios e Laticínios
				int produtoLat;
				double Queijo = 10.4;
				double Presunto = 2.0;
				int produtoLatQtd;
				double produtoLatQtdTotal;
				int opcao;
				
				//Variáveis Sessão Cereais e Massas
				int produtoCerMass;
				double Arroz = 3.5;
				double Macarrao = 3.2;
				int produtoCerMassQtd;
				double produtoCerMassQtdTotal;
				
				//Variáveis Sessão Hortifrutis
				int produtoHorti;
				double banana = 6.45;
				double tomate = 7.25;
				int produtoHortiQtd;
				double produtoHortiQtdTotal;
				
				
					//Informar a sessão					
					System.out.println("Bem vindo ao Mercadinho" + "\n" + "Informe a Sessão Alimentícia");					
					System.out.println("1. Padaria" + "\n" + "2. Frios e Laticínios" + "\n" + "3. Cereais e Massas" + "\n" + "4. Hortifrutis");
					SessAli = leitor.nextInt();
					
					
					do	{
						//Caso o usuário infome um valor diferente de 1 ou 2.
						while (SessAli != 1 && SessAli != 2 && SessAli != 3	&& SessAli != 4) {
								System.out.println("Sessão Alimentícia não identificada, informe novamente");
								System.out.println("1. Padaria" + "\n" + "2. Frios e Laticínios" + "\n" + "3. Cereais e Massas" + "\n" + "4. Hortifrutis");
				                SessAli = leitor.nextInt();   
						}
						
							//Switch Case para a escolha da sessão alimentícia e dos produtos para compra
								switch (SessAli)    {
				    
									//CASE 1: Calculo da Sessão: Padaria
									case 1:	System.out.println("Bem Vindo à Padaria" + "\n" + "Selecione o produto desejado");
				                			System.out.println("1. Pão Françês R$ 0,50" + "\n" + "2. Pão de Queijo R$0,75");
				                			produtoPad = leitor.nextInt();
				                
				                			//Condição para caso o usuário escolha um valor diferente de 1 ou de 2
				                			while (produtoPad > 2 | produtoPad < 1) {
				                				System.out.println("Produto não identificado, informe novamente");
				                				System.out.println("1. Pão Françês R$ 0,50" + "\n" + "2. Pão de Queijo R$0,75");
				                				produtoPad = leitor.nextInt();
				                			}
		                            
				                			System.out.println("Informe a quantidade desejada: ");
				                			produtoPadQtd = leitor.nextInt();
		                        
				                			if (produtoPad == 1)   {
				                				produtoPadQtdTotal = produtoPadQtd * paoFranc;
				                				System.out.println("O total a pagar na padaria é de: R$ " + produtoPadQtdTotal);
				                				System.out.println("Continuar comprando na Padaria ?");
				                			}
				                			else    {  
				                                	if  (produtoPad == 2)    {
				                                	produtoPadQtdTotal = produtoPadQtd * paoQueij;
				                                    System.out.println("O total a pagar na padaria é de: R$ " + produtoPadQtdTotal);
				                                    System.out.println("Continuar comprando na Padaria ?");
				                                	} 
				                        
				                			} 
			  
				                			break;
			
				                    //CASE 2: Calculo da Sessão: Frios e Laticínios
									case 2 :	System.out.println("Bem Vindo à Sessão de Frios e Laticínios" + "\n" + "Selecione o produto desejado");
												System.out.println("1. Queijo fatiago 200g R$ 10,40" + "\n" + "2. Presunto Fatiado 200g R$2,00");
				                    			produtoLat = leitor.nextInt();
				                
				                    			//Condição "while" para caso o usuário escolha um valor diferente de 1 ou de 2
				                    			while (produtoLat < 1 | produtoLat > 2) {
				                    				System.out.println("Produto não identificado, informe novamente");
				                    				System.out.println("1. Queijo fatiago 200g R$ 10,40" + "\n" + "2. Presunto Fatiado 200g R$2,00");
				                    				produtoLat = leitor.nextInt();
				                    			}
				                    				System.out.println("Informe a quantidade desejada: ");
				                    				produtoLatQtd = leitor.nextInt();
				                
				                    					if (produtoLat == 1)   {
				                    						produtoLatQtdTotal = Queijo * produtoLatQtd;
				                    						System.out.println("O total a pagar na sessão de Frios e Laticínios é de: R$ " + produtoLatQtdTotal);
				                    						System.out.println("Continuar comprando nesta sessão ?");
				                    					}
				                    					else    {  
				                    						if  (produtoLat == 2)    {
				                    							produtoLatQtdTotal = Presunto * produtoLatQtd;
				                    							System.out.println("O total a pagar na sessão de Frios e Laticínios é de: R$ " + produtoLatQtdTotal);
				                    							System.out.println("Continuar comprando nesta sessão ?");
				                    						} 
				                    					} 
				                    					
				                    					break;
				                    					
				                    //CASE 3: Calculo da Sessão: Cereais e Massas
									case 3 :	System.out.println("Bem Vindo à Sessão de Massas e Cereais" + "\n" + "Selecione o produto desejado");
				                    			System.out.println("1. Pacote de Arroz de 500g R$ 3,50" + "\n" + "2. Pacote de Macarrão 350g R$3,20");
				                    			produtoCerMass = leitor.nextInt();
				                
				                    			//Condição "while" para caso o usuário escolha um valor diferente de 1 ou de 2
				                    			while (produtoCerMass < 1 | produtoCerMass > 2) {
				                    				System.out.println("Produto não identificado, informe novamente");
				                    				System.out.println("1. Pacote de Arroz de 500g R$ 3,50" + "\n" + "2. Pacote de Macarrão 350g R$3,20");
				                    				produtoCerMass = leitor.nextInt();
				                    			}
				                    				System.out.println("Informe a quantidade desejada: ");
				                    				produtoCerMassQtd = leitor.nextInt();
				                
				                    					if (produtoCerMass == 1)   {
				                    						produtoCerMassQtdTotal = Arroz * produtoCerMassQtd;
				                    						System.out.println("O total a pagar na sessão de Cereais e Massas é de: R$ " + produtoCerMassQtdTotal);
				                    						System.out.println("Continuar comprando nesta sessão ?");
				                    					}
				                    					else    {  
				                    						if  (produtoCerMass == 2)    {
				                    							produtoCerMassQtdTotal = Macarrao * produtoCerMassQtd;
				                    							System.out.println("O total a pagar na sessão de Cereais e Massas é de: R$ " + produtoCerMassQtdTotal);
				                    							System.out.println("Continuar comprando nesta sessão ?");
				                    						} 
				                    					} 
				                    					
				                    					break;
				                    					
				                    //CASE 4: Calculo da Sessão: Hortifrutis
									case 4 :	System.out.println("Bem Vindo à Sessão de Hortifrutis" + "\n" + "Selecione o produto desejado");
				                    			System.out.println("1. Cacho de Banana Prata 500g R$ 6,45" + "\n" + "2. Tomate Italiano 500g R$7,25");
				                    			produtoHorti = leitor.nextInt();
				                
				                    			//Condição "while" para caso o usuário escolha um valor diferente de 1 ou de 2
				                    			while (produtoHorti < 1 | produtoHorti > 2) {
				                    				System.out.println("Produto não identificado, informe novamente");
				                    				produtoHorti = leitor.nextInt();
				                    			}
				                    				System.out.println("Informe a quantidade desejada: ");
				                    				produtoHortiQtd = leitor.nextInt();
				                
				                    					if (produtoHorti == 1)   {
				                    						produtoHortiQtdTotal = banana * produtoHortiQtd;
				                    						System.out.println("O total a pagar na sessão de Cereais e Massas é de: R$ " + produtoHortiQtdTotal);
				                    						System.out.println("Continuar comprando na Sessão de Cereais e Massas ?");
				                    					}
				                    					else    {  
				                    						if  (produtoHorti == 2)    {
				                    							produtoCerMassQtdTotal = tomate * produtoHortiQtd;
				                    							System.out.println("O total a pagar na sessão de Hortifrutis é de: R$ " + produtoCerMassQtdTotal);
				                    							System.out.println("Continuar comprando nesta sessão ?");
				                    						} 
				                    					}					
								}
								
															//Continuar comprando (na mesma Sessão)
															System.out.println("Digite 1 para Sim ou 2 para Sair");
															opcao = leitor.nextInt();
								
					}
							while	(opcao == 1);	
								System.out.println("Obrigado e volte sempre !");
							
}				
}