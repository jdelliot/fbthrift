#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

import folly.iobuf as _fbthrift_iobuf
import thrift.py3.types
import thrift.py3.client
import thrift.py3.common
import typing as _typing
from types import TracebackType

import module.types as _module_types
import facebook.thrift.annotation.cpp.types as _facebook_thrift_annotation_cpp_types
import facebook.thrift.annotation.hack.types as _facebook_thrift_annotation_hack_types
import facebook.thrift.annotation.python.types as _facebook_thrift_annotation_python_types
import facebook.thrift.annotation.thrift.types as _facebook_thrift_annotation_thrift_types


_ServiceT = _typing.TypeVar('_ServiceT', bound='Service')


class Service(thrift.py3.client.Client):

    async def func(
        self,
        arg1: str,
        arg2: str,
        arg3: _module_types.Foo,
        rpc_options: _typing.Optional[thrift.py3.common.RpcOptions]=None
    ) -> int: ...

