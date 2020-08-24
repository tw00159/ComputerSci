#!/usr/bin/env python3

"""
Python program to create a function that tests user input password with
a regular expression in order to discern whether the password is strong or not.
"""

import re

__author__ = "Taylor Wilson"
__version__ = "Fall 2020"

def check_strength(password):
    """
    checks strength of password
    Arguments:
    password -- the specified password to check
    """
    is_strong = True
    if len(password) < 8:
        is_strong = False

    upper_case = re.compile(r'[A-Z]')
    if not upper_case.search(password):
        is_strong = False

    lower_case = re.compile(r'[a-z]')
    if not lower_case.search(password):
        is_strong = False

    number_pattern = re.compile(r'[0-9]')
    if not number_pattern.search(password):
        is_strong = False


    state = 'strong' if is_strong else 'not strong' #ternary operator
    print('Your password is ' + state + ".")


def main():
    """launches the script"""
    print('Please input a password')
    password = input()
    check_strength(password)

if __name__ == '__main__':
    main()
