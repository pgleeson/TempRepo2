#  ******************************************************
# 
#     File generated by: neuroConstruct v1.4.1
# 
#  ******************************************************

import neuron
from neuron import hoc
import nrn

#  Note: As neuroConstruct already generates hoc, much of this is reused and not (yet) converted 
#  to pure Python. It is mainly the cell and network creation that will benefit from the Python parsing of XML/HDF5

hoc.execute('load_file("TestHDF5.hoc")')
