fruits = {
    "apple": "23",
    "avocado": "65",
    "banana": "10"
}

fruit_check = input("Enter the name of fruit: ")

if fruit_check in fruits:
    print("fruit is available")
else:
    print("sorry, it is unavailable")