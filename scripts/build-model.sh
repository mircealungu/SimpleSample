#!/bin/bash
DIR=`pwd`
echo $DIR

cd /Users/mircea/Research/external\ tools/inFusion727/tools/inFusion/
./java2mse.sh $DIR/.. famix30 $DIR/../models/$1
