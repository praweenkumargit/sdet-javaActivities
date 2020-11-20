#numbers = input("Enter numbers separated by commas")
#numbersList = numbers.split(",")

num_tuple = tuple(input("Enter numbers separated by commas").split(","))

print(num_tuple) 



for num in num_tuple:
    if (int(num) % 5 == 0):
        print(num)