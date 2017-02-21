import numpy as np
import pandas
from sklearn.tree import DecisionTreeClassifier

import sys
sys.path.append("..")
#from shad_util import print_answer

# 1. Load from titanic.csv
df = pandas.read_csv('titanic.csv', index_col='PassengerId')

#2. Leave in your select 4 features: Pclass, Fare, Age, Sex
x_labels = ['Pclass', 'Fare', 'Age', 'Sex']
X = df.loc[:,x_labels]

#3. Notice that Sex feature have string values
X['Sex'] = X['Sex'].map(lambda sex:1 if sex == 'male' else 0)

#4. Select target variable - it written in Survived column
y=df['Survived']

#5. Datas have miss value - nAn. Find all them and delete
X=X.dropna()
y=y[X.index.values]

#6. Teach decision tree with parametr random_State=241
clf = DecisionTreeClassifier(random_state=241)
clf.fit(np.array(X.values), np.array(y.values))

#7.
importances = pandas.Series(clf.feature_importances_, index=x_labels)
print(importances.sort_values(ascending=False).head(2).index.values)