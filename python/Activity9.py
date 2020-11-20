num1_list = [1, 2, 3, 4, 6, 8, 9]
num2_list = [22, 55 ,23, 66, 88]
num_list = []

for number in num1_list:
 if ((number % 2) != 0):
    num_list.append(number)
    #print(num_list)

for number in num2_list:
        if((number % 2) == 0):
            num_list.append(number)



print(num_list)
            