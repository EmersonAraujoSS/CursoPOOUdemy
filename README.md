Set<T>
• Representa um conjunto de elementos (similar ao da Álgebra)
• Não admite repetições
• Elementos não possuem posição
• Acesso, inserção e remoção de elementos são rápidos
• Oferece operações eficientes de conjunto: interseção, união, diferença.

Principais implementações: 
• HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
• TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo 
compareTo do objeto (ou Comparator)
• LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados


Map<K,V>
• É uma coleção de pares chave / valor
• Não admite repetições do objeto chave
• Os elementos são indexados pelo objeto chave (não possuem posição)
• Acesso, inserção e remoção de elementos são rápidos
• Uso comum: cookies, local storage, qualquer modelo chave-valor

Principais implementações: 
• HashMap - mais rápido (operações O(1) em tabela hash) e não ordenado
• TreeMap - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo 
compareTo do objeto (ou Comparator)
• LinkedHashMap - velocidade intermediária e elementos na ordem em que são adicionados
