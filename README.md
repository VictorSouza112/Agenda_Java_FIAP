# Agenda_Java_FIAP
Esse repositório é uma agenda que criei enquanto realizava o curso de "Nivalemento" da FIAP.

1.Agenda_Java (Pasta Principal):

  Menu.java: Esta é a classe principal do programa. Ela exibe um menu para o usuário e executa a ação correspondente com base na opção escolhida pelo usuário. As opções do menu incluem adicionar um novo contato, editar um contato existente, pesquisar um contato, listar todos os contatos, apagar um contato e sair do programa.


  opcoes (Pasta Secundária):
  
  AddContact.java: Esta classe é responsável por adicionar um novo contato à lista de contatos. Ela solicita ao usuário que insira o nome, o número do celular e o e-mail do novo contato. Em seguida, cria um novo objeto Contact com essas informações e o adiciona à lista de contatos.
    
  EditContact.java: Esta classe é responsável por editar um contato existente na lista de contatos. Ela solicita ao usuário que insira o nome do contato que deseja editar. Se o contato for encontrado, ela solicita ao usuário que insira as novas informações (nome, número do celular e e-mail) e atualiza o contato com essas novas informações. Se o contato não for encontrado, ela exibe uma mensagem informando que o registro não foi encontrado.
    
  SrcContact.java: Esta classe é responsável por pesquisar um contato na lista de contatos. Ela solicita ao usuário que insira o nome do contato que deseja pesquisar. Se o contato for encontrado, ela exibe as informações do contato (nome, número do celular e e-mail). Se o contato não for encontrado, ela exibe uma mensagem informando que o registro não foi encontrado.

  ListContact.java: Esta classe é responsável por listar todos os contatos na lista de contatos. Ela percorre a lista de contatos e exibe as informações de cada contato (nome, número do celular e e-mail).

  DelContact.java: Esta classe é responsável por apagar um contato existente na lista de contatos. Ela solicita ao usuário que insira o nome do contato que deseja apagar. Se o contato for encontrado, ele é removido da lista de contatos e uma mensagem de sucesso é exibida. Se o contato não for encontrado, ela exibe uma mensagem informando que o registro não foi encontrado.


  model
  
  Contact.java: Esta é a classe modelo para um contato. Ela tem três campos: name, cellNumber e email. Ela também tem métodos getter e setter para cada um desses campos.
