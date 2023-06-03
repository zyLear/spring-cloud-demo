#!/bin/bash

# this file is for building docker image locally

set -e
# shellcheck disable=SC2046
CURRENT_DIRECTORY=$(cd $(dirname $0) && pwd)
PROJECT_ROOT=$(dirname ${CURRENT_DIRECTORY})
TAG=${TAG:-latest}

# build
cd ${PROJECT_ROOT}
mvn clean install -Dmaven.test.skip=true

# copy the jar to build context path
cp -p ${PROJECT_ROOT}/target/*.jar ${CURRENT_DIRECTORY}

cd ${CURRENT_DIRECTORY}
# run docker build image
docker build --pull -t cloud-register:${TAG} .

# clean the jars
rm *.jar