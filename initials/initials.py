def get_initials(fullname):
    """ Given a person's name, returns the person's initials (uppercase) """
    initials = fullname[0] 
    first_int = fullname[0]
    for i in range(len(fullname)-1):
        a = fullname[i]
        if a == " ":
            next_int = fullname[i +1]
            initials = initials + next_int
    return initials.upper()


def main():
    fullname = input('What is your full name?')
    print(get_initials(fullname))

if __name__== '__main__':
    main()