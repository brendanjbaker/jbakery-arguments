#!/bin/bash

set -euxo pipefail

path_script=$(readlink -f "$0")

pushd $path_script/../jbakery-arguments
export JAVA_HOME=$(dirname $(dirname $(readlink -f $(which java))))
mvn --batch-mode release:clean release:prepare
popd
