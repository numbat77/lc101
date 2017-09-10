from helpers import alphabet_position, rotate_character

def encrypt(text, rot):
    '''encryptics a message using a Caesar cipher'''
    encrypted = ''
    for char in text:
        if not char.isalpha():
            encrypted += char
        else:
            encrypted += rotate_character(char, rot)

    return encrypted

def main():
    text = input("Type a message:")
    rot = int(input('Rotate by:'))
    print(encrypt(text, rot))

if __name__ == "__main__":
    main()
