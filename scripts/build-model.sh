#!/bin/sh

if [ $# -ne 2 ]
then
	echo "Usage: `basename $0` <famix21|famix30> <filename.mse> " >&2  # Error message >stderr.
	exit $E_WRONGARGS
fi  

DIR=`pwd`
INFDIR=/Users/mircea/Research/externaltools/inFusion727/tools/inFusion/

echo $INFDIR
cd $INFDIR 
./java2mse.sh $DIR/.. $1 $DIR/../models/$2
cd $DIR
