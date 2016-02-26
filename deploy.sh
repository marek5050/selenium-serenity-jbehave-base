#!/bin/bash
set -e # exit with nonzero exit code if anything fails

# clear and re-create the out directory
rm -rf out || exit 0;
mkdir out;

git config --global user.email "marek.bejda@gmail.com"
git config --global user.name "Marek Bejda"

git clone https://github.com/marek5050/marek5050.github.io.git

# run our compile script, discussed above
rm -r marek5050.github.io/static/serenity/*
cp -rf target/site/serenity/* marek5050.github.io/static/serenity/

# go to the out directory and create a *new* Git repo
cd marek5050.github.io

# The first and only commit to this new Git repo contains all the
# files present with the commit message "Deploy to GitHub Pages".
git add static/serenity/*
git commit -m "Deploy to GitHub Pages"

# Force push from the current repo's master branch to the remote
# repo's gh-pages branch. (All previous history on the gh-pages branch
# will be lost, since we are overwriting it.) We redirect any output to
# /dev/null to hide any sensitive credential data that might otherwise be exposed.
git push --force --quiet "https://marek5050:${GH_TOKEN}@github.com/marek5050/marek5050.github.io.git" --all  > /dev/null 2>&1