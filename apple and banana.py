from keras.layers import Convolution2D
from keras.layers import MaxPooling2D
from keras.layers import Flatten
from keras.layers import Dense
from  keras.models import Sequential


model = Sequential()

model.add(Convolution2D(filters=16, 
                        kernel_size=(3,3),
                        activation='relu',
                        input_shape=(64, 64, 3)                        
                       ))

model.add(MaxPooling2D(pool_size=(2,2)))

model.add(Convolution2D(filters=16, 
                        kernel_size=(3,3),
                        activation='relu',
                        input_shape=(64, 64, 3)                        
                       ))

model.add(MaxPooling2D(pool_size=(2,2)))
model.add(Flatten())
model.add(Dense(units=128, activation='relu'))
model.summary()