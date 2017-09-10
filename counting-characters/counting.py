def count_char(input):
    """Returns the character count"""
    char_dict = {}
    for letter in input:
        if letter in char_dict:
            break
        if letter not in char_dict:
            char_dict[letter] = input.count()
    return char_dict         

def main():
    input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus."
    print(count_char(input))

if __name__ == "__main__":
    main()