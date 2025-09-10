# Listas_Encadeadas


EXERCÍCIOS 1 E 2 -----------------------------------------------------------------------------------------------

Para o exercício 1 e 2, ambos foram feitos em um mesmo programa. Ao rodá-lo é perguntado ao usuário se ele deseja criar uma fila ou uma pilha. Após selecionar, o usuário recebe as opções de Inserir um valor, Remover um valor, Imprimir a fila/pilha ou sair do programa. 

Enquanto o usuário não escolher a opção de sair do programa, as opções descritas acima fica sendo impressas após cada escolha feita por ele.

Ao escolher inserir, o programa pede qual valor o usuário deseja inserir.
Ao escolher remover, o programa remove de acordo com sua estrutura de armazenamento -- pilha (o último valor adicionado é removido por primeiro) ou fila (o primeiro valor que foi adicionado é removido por primeiro).


EXERCÍCIO 3 -----------------------------------------------------------------------------------------------------

Para o exercício 3, foram feitos dois programas distintos. Um utilizando listas encadeadas e outro utilizando vetores estáticos.


EXERCÍCIO 3 (VETOR)
 Primeiramente, é requerido ao usuário que ele determine o tamanho dos vetores que serão criados. O valor inserido por ele nesta etapa, determinará o tamanho tanto dos vetores A, quanto o B e o C também.
 Após a criação dos vetores, o usuário possui duas opções: inserir valores no vetor A ou começar a inserir valores no vetor B. Ao escolher a primeira opção, o programa pede para o usuário inserir qual valor deseja que seja adicionado ao vetor A. O programa retorna para a opção de inserir valor no vetor A ou ir para o vetor B, e assim se repete até o preenchimento total do vetor A.

 Quando o usuário escolher avançar para o vetor B, ele não poderá mais alterar o vetor A. As opções disponibilizadas agora para o usuário são: Inserir valor no Vetor B ou ir para o vetor C. A mesma lógica de inserção utilizada no vetor A funciona aqui para o vetor B -- ao escolher a primeira opção, o programa pede para o usuário inserir qual valor deseja que seja adicionado ao vetor B. O programa então retorna para a opção de inserir valor no vetor B ou ir para o vetor C, e assim se repete até o preenchimento total do vetor B.

 Quando o usuário escolher avançar para o vetor C, ele não poderá mais alterar o vetor B. Ao selecionar a opção de ir para o vetor C, o merge entre o vetor A e B já é feito automaticamente, sendo o vetor C printado logo em seguida. Assim também é encerrado o programa.


EXERCÍCIO 3 (LISTAS ENCADEADAS)
    O processo de funcionamento do programa utilizando listas encadeadas é muito similar ao de vetores. A única diferença na verdade é que não é requerido do usuário estipular o tamanho da lista logo de início, justamente por se tratarem de listas de tamanho dinâmico.



