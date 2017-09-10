import string
from helpers import rotate_character, alphabet_position

def encrypt(text, key):
    '''encrypts a message using a Vigenere cipher'''
    count = 0
    encrypted = ''

    for char in text:
       if char.isalpha():
            
            key_char = key[count % len(key)]
            rot = alphabet_position(key_char)
            encrypted += rotate_character(char, rot)
            count += 1

       else:
            encrypted += char

    return encrypted

def main():

    text = input("Type a message:")
    key = input('Encryption key:')
    
    print(encrypt(text, key))


if __name__ == "__main__":
    main()