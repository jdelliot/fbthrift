#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

from libcpp.string cimport string
from libcpp cimport bool as cbool
from cpython cimport bool as pbool
from libc.stdint cimport int8_t, int16_t, int32_t, int64_t
from libcpp.memory cimport shared_ptr, unique_ptr
from libcpp.vector cimport vector
from libcpp.set cimport set as cset
from libcpp.map cimport map as cmap, pair as cpair
from thrift.py3.exceptions cimport cTException, Error as __Error
cimport thrift.py3.types




cdef extern from "src/gen-cpp2/module_types_custom_protocol.h" namespace "cpp2":
    # Forward Declaration
    cdef cppclass cEmpty "cpp2::Empty"
    # Forward Declaration
    cdef cppclass cNada "cpp2::Nada"

cdef extern from "src/gen-cpp2/module_types.h" namespace "cpp2":
    cdef cppclass cEmpty__isset "cpp2::Empty::__isset":
        pass

    cdef cppclass cEmpty "cpp2::Empty":
        cEmpty() except +
        cEmpty(const cEmpty&) except +
        bint operator==(cEmpty&)
        cEmpty__isset __isset

    cdef enum cNada__type "cpp2::Nada::Type":
        cNada__type___EMPTY__ "cpp2::Nada::Type::__EMPTY__",

    cdef cppclass cNada "cpp2::Nada":
        cNada() except +
        cNada(const cNada&) except +
        bint operator==(cNada&)
        cNada__type getType() const


cdef extern from "<utility>" namespace "std" nogil:
    cdef shared_ptr[cEmpty] move(unique_ptr[cEmpty])
    cdef shared_ptr[cEmpty] move_shared "std::move"(shared_ptr[cEmpty])
    cdef unique_ptr[cEmpty] move_unique "std::move"(unique_ptr[cEmpty])
    cdef shared_ptr[cNada] move(unique_ptr[cNada])
    cdef shared_ptr[cNada] move_shared "std::move"(shared_ptr[cNada])
    cdef unique_ptr[cNada] move_unique "std::move"(unique_ptr[cNada])

cdef extern from "<memory>" namespace "std" nogil:
    cdef shared_ptr[const cEmpty] const_pointer_cast "std::const_pointer_cast<const cpp2::Empty>"(shared_ptr[cEmpty])
    cdef shared_ptr[const cNada] const_pointer_cast "std::const_pointer_cast<const cpp2::Nada>"(shared_ptr[cNada])

# Forward Definition of the cython struct
cdef class Empty(thrift.py3.types.Struct)

cdef class Empty(thrift.py3.types.Struct):
    cdef object __hash
    cdef object __weakref__
    cdef shared_ptr[cEmpty] _cpp_obj

    @staticmethod
    cdef unique_ptr[cEmpty] _make_instance(
        cEmpty* base_instance
    ) except *

    @staticmethod
    cdef create(shared_ptr[cEmpty])

# Forward Definition of the cython struct
cdef class Nada(thrift.py3.types.Union)

cdef class Nada(thrift.py3.types.Union):
    cdef object __hash
    cdef object __weakref__
    cdef shared_ptr[cNada] _cpp_obj
    cdef object __type
    cdef object __cached
    cdef _load_cache(Nada self)

    @staticmethod
    cdef unique_ptr[cNada] _make_instance(
        cNada* base_instance
    ) except *

    @staticmethod
    cdef create(shared_ptr[cNada])




