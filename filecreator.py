import random

def main():
    authors = ["Subichev", "Tran", "Iyer", "Samsudeen", "Liu", "Krishnan"]
    with open("isbn.txt", "w") as file:
        #make 25 numbers
        #xxxxxx-title-author
        for i in range(25):
            isbn = ""
            title = ""
            num = random.randrange(9_999_999_999)
            #add leading 0s if needed
            isbn += (6-len(str(num)))*"0" + str(num) + " "
            for j in range(13):
                title += chr(random.randrange(65, 127))
            isbn += title + " " + authors[random.randrange(0,6)]
            file.write(isbn)
            if i < 24: file.write("\n")
        file.close()


if __name__ == "__main__":
    main()