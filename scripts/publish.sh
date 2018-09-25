#!/bin/bash

set -euxo pipefail

path_script=$(readlink -f "$0")
path_root=$(dirname "$path_script")

pushd $path_root/../jbakery-arguments
export JAVA_HOME=$(dirname $(dirname $(readlink -f $(which java))))
mvn release:clean release:prepare
popd
