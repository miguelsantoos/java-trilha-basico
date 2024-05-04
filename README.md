# java-trilha-basico
Desafio do bootcamp santander

No desafio de criar uma simulação de uma conta bancária, com o número da conta, agência, saldo, nome e sobrenome.
Tive dificldade com a varíavel saldo, ela do tipo double não aceitava a entrada de um número com virgula ou ponto,
exemplo "123,4", tirei a duvida de como resolver no forum da DIO, e para a solução coloquei o metodo Locale, que 
ao declarar a localidade, exemplo "US", vc segue alguns padrões daquela localidade, e um exemplo é a escrita que apartir 
dessa declaração a variavel passa a aceitar a virgula como padrão.
