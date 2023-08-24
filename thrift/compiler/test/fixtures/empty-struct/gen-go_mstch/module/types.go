// @generated by Thrift for [[[ program path ]]]
// This file is probably not the place you want to edit!

package module // [[[ program thrift source path ]]]

import (
    "fmt"
    "strings"

    thrift "github.com/facebook/fbthrift/thrift/lib/go/thrift"
)


// (needed to ensure safety because of naive import list construction)
var _ = fmt.Printf
var _ = thrift.ZERO
var _ = strings.Split


type Empty struct {
}
// Compile time interface enforcer
var _ thrift.Struct = &Empty{}

func NewEmpty() *Empty {
    return (&Empty{})
}


// Deprecated: Use Empty.Set* methods instead or set the fields directly.
type EmptyBuilder struct {
    obj *Empty
}

func NewEmptyBuilder() *EmptyBuilder {
    return &EmptyBuilder{
        obj: NewEmpty(),
    }
}

func (x *EmptyBuilder) Emit() *Empty {
    var objCopy Empty = *x.obj
    return &objCopy
}

func (x *Empty) Write(p thrift.Protocol) error {
    if err := p.WriteStructBegin("Empty"); err != nil {
        return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", x), err)
    }

    if err := p.WriteFieldStop(); err != nil {
        return thrift.PrependError(fmt.Sprintf("%T write field stop error: ", x), err)
    }

    if err := p.WriteStructEnd(); err != nil {
        return thrift.PrependError(fmt.Sprintf("%T write struct end error: ", x), err)
    }
    return nil
}

func (x *Empty) Read(p thrift.Protocol) error {
    if _, err := p.ReadStructBegin(); err != nil {
        return thrift.PrependError(fmt.Sprintf("%T read error: ", x), err)
    }

    for {
        _, typ, id, err := p.ReadFieldBegin()
        if err != nil {
            return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", x, id), err)
        }

        if typ == thrift.STOP {
            break;
        }

        switch id {
        default:
            if err := p.Skip(typ); err != nil {
                return err
            }
        }

        if err := p.ReadFieldEnd(); err != nil {
            return err
        }
    }

    if err := p.ReadStructEnd(); err != nil {
        return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", x), err)
    }

    return nil
}

func (x *Empty) String() string {
    if x == nil {
        return "<nil>"
    }

    var sb strings.Builder

    sb.WriteString("Empty({")
    sb.WriteString("})")

    return sb.String()
}

type Nada struct {
}
// Compile time interface enforcer
var _ thrift.Struct = &Nada{}

func NewNada() *Nada {
    return (&Nada{})
}

func (x *Nada) countSetFields() int {
    count := int(0)
    return count
}

func (x *Nada) CountSetFieldsNada() int {
    return x.countSetFields()
}


// Deprecated: Use Nada.Set* methods instead or set the fields directly.
type NadaBuilder struct {
    obj *Nada
}

func NewNadaBuilder() *NadaBuilder {
    return &NadaBuilder{
        obj: NewNada(),
    }
}

func (x *NadaBuilder) Emit() *Nada {
    var objCopy Nada = *x.obj
    return &objCopy
}

func (x *Nada) Write(p thrift.Protocol) error {
    if countSet := x.countSetFields(); countSet > 1 {
        return fmt.Errorf("%T write union: no more than one field must be set (%d set).", x, countSet)
    }
    if err := p.WriteStructBegin("Nada"); err != nil {
        return thrift.PrependError(fmt.Sprintf("%T write struct begin error: ", x), err)
    }

    if err := p.WriteFieldStop(); err != nil {
        return thrift.PrependError(fmt.Sprintf("%T write field stop error: ", x), err)
    }

    if err := p.WriteStructEnd(); err != nil {
        return thrift.PrependError(fmt.Sprintf("%T write struct end error: ", x), err)
    }
    return nil
}

func (x *Nada) Read(p thrift.Protocol) error {
    if _, err := p.ReadStructBegin(); err != nil {
        return thrift.PrependError(fmt.Sprintf("%T read error: ", x), err)
    }

    for {
        _, typ, id, err := p.ReadFieldBegin()
        if err != nil {
            return thrift.PrependError(fmt.Sprintf("%T field %d read error: ", x, id), err)
        }

        if typ == thrift.STOP {
            break;
        }

        switch id {
        default:
            if err := p.Skip(typ); err != nil {
                return err
            }
        }

        if err := p.ReadFieldEnd(); err != nil {
            return err
        }
    }

    if err := p.ReadStructEnd(); err != nil {
        return thrift.PrependError(fmt.Sprintf("%T read struct end error: ", x), err)
    }

    return nil
}

func (x *Nada) String() string {
    if x == nil {
        return "<nil>"
    }

    var sb strings.Builder

    sb.WriteString("Nada({")
    sb.WriteString("})")

    return sb.String()
}

// RegisterTypes registers types found in this file that have a thrift_uri with the passed in registry.
func RegisterTypes(registry interface {
	  RegisterType(name string, obj any)
}) {

}
