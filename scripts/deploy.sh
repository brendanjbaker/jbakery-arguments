#!/bin/bash

set -euxo pipefail

path_script=$(readlink -f "$0")
path_root=$(dirname $(dirname "$path_script"))
project=jbakery-arguments

pushd $path_root/$project
export GPG_TTY=$(tty)
export JAVA_HOME=$(dirname $(dirname $(readlink -f $(which java))))
mvn clean deploy
popd
