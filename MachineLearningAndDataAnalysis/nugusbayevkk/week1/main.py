#!/usr/bin/python
import numpy as np
import pandas
from sklearn.tree import DecisionTreeClassifier

import sys
sys.path.append("..")
from shad_util import print_answer

# 1. Load set from titanic.csv with PAndas package
df = pandas.read_csv('titanic.csv', index_col='PassengerId')
print(df)
