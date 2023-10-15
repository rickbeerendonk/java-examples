#! /bin/bash

SCRIPT_DIR=$( cd -- "$( dirname -- "${BASH_SOURCE[0]}" )" &> /dev/null && pwd )
FILE=$1
FILE_DIR=$2

color_off="\033[0m"
blue="\033[0;34m"
bold=$(tput bold)
normal=$(tput sgr0)

# Clear terminal
clear

if [[ $FILE == *.java ]]; then
    # Script
    echo "${blue}${bold}Run:${normal}${color_off} $FILE"
    # Show compiler version
    # javac -version
    echo

    # javac "$FILE"
    java --source 21 --enable-preview "$FILE"
fi