import result as result

#Bem, este algoritmo usa o metodo dividir para conquista. Esse método consiste em pegar um array e dividi-lo conforme
#queira. O natural é que haja a divisão pelo meio do array. Ou seja, um array será dividido em dois. Esses novos dois
#arrays serão divididos em mais dois(Ou seja, será formado 4 sub-arrays). Este procedimento somente irá parar quando 
#não mais haver possibilidade de divisão. Nesta hora haverá o tratamento para ordenamento. Assim sendo, é impossível
#que não seja ordenado. Nota-se que este algoritmo possui complexidade O(nlogn), sendo um dos melhores métodos de 
#ordenamento.


#Este função que fará o papel de retorno ligando os sub-arrays até a formação do novo principal
def merge(left, right):
    result = []

#Estas são variáveis auxiliares 
i, j = 0

while(i < len(left) and j < len(right)):
    if left[i] <= right[j]:
        result.append(left[i])
        i+=1
    else:
        result.append(right[j])
        j+=1

result += left[i:]
result += right[j:]

return result

def mergeSort(lst):
    if len(lst)<=1:
        return lst
mid = int(len(lst)/2)
left = mergeSort(lst[:mid])
right = mergeSort(lst[mid:])

return merge(left, right)

array = [24, 3, 5, 2, 1, 353, 53, 7674, 65, 878, 9898]
print(mergeSort(array))

