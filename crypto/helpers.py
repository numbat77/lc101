import string
def alphabet_position(letter):
    alpha_low = string.ascii_lowercase
    alpha_up = string.ascii_uppercase
    if letter.islower():
        return alpha_low.find(letter)
    else:
        return alpha_up.find(letter)


def rotate_character(char, rot):
    alpha_low = string.ascii_lowercase
    alpha_up = string.ascii_uppercase
    char_pos = alphabet_position(char)
    new_char_pos = char_pos + rot
    
    if char.islower():
        if new_char_pos < 26:
            return alpha_low[new_char_pos]
        else:
            return alpha_low[new_char_pos % 26]
    else:
        if new_char_pos < 26:
            return alpha_up[new_char_pos]
        else:
            return alpha_up[new_char_pos % 26]

