Java e JPA: Persista seus objeto com a JPA2 e Hibernate


- Aula:
Escrever SQL no código Java é trabalhoso e precisa de manutenção contínua
A JPA é um ORM (Object Relacional Mapper) Java
Um ORM mapeia as classes para tabelas e gera o SQL de forma automática
Para inicializar a JPA, é preciso definir um arquivo de configuração, chamado persistence.xml
Nele, colocamos as configurações mais importantes, como o driver e os dados da conexão
A classe Persistence lê a configuração e cria uma EntityManagerFactory
Podemos usar a JPA para gerar e atualizar as tabelas no banco de dados
Uma entidade deve usar as anotações @Entity e @Id
@GeneratedValue não é obrigatório, mas pode ser útil para definir uma chave auto-increment

