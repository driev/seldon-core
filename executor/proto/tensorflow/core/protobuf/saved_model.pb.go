// Code generated by protoc-gen-go. DO NOT EDIT.
// source: tensorflow/core/protobuf/saved_model.proto

package protobuf

import (
	fmt "fmt"
	proto "github.com/golang/protobuf/proto"
	math "math"
)

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion3 // please upgrade the proto package

// SavedModel is the high level serialization format for TensorFlow Models.
// See [todo: doc links, similar to session_bundle] for more information.
type SavedModel struct {
	// The schema version of the SavedModel instance. Used for versioning when
	// making future changes to the specification/implementation. Initial value
	// at release will be 1.
	SavedModelSchemaVersion int64 `protobuf:"varint,1,opt,name=saved_model_schema_version,json=savedModelSchemaVersion,proto3" json:"saved_model_schema_version,omitempty"`
	// One or more MetaGraphs.
	MetaGraphs           []*MetaGraphDef `protobuf:"bytes,2,rep,name=meta_graphs,json=metaGraphs,proto3" json:"meta_graphs,omitempty"`
	XXX_NoUnkeyedLiteral struct{}        `json:"-"`
	XXX_unrecognized     []byte          `json:"-"`
	XXX_sizecache        int32           `json:"-"`
}

func (m *SavedModel) Reset()         { *m = SavedModel{} }
func (m *SavedModel) String() string { return proto.CompactTextString(m) }
func (*SavedModel) ProtoMessage()    {}
func (*SavedModel) Descriptor() ([]byte, []int) {
	return fileDescriptor_537826d0bcc2f334, []int{0}
}

func (m *SavedModel) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_SavedModel.Unmarshal(m, b)
}
func (m *SavedModel) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_SavedModel.Marshal(b, m, deterministic)
}
func (m *SavedModel) XXX_Merge(src proto.Message) {
	xxx_messageInfo_SavedModel.Merge(m, src)
}
func (m *SavedModel) XXX_Size() int {
	return xxx_messageInfo_SavedModel.Size(m)
}
func (m *SavedModel) XXX_DiscardUnknown() {
	xxx_messageInfo_SavedModel.DiscardUnknown(m)
}

var xxx_messageInfo_SavedModel proto.InternalMessageInfo

func (m *SavedModel) GetSavedModelSchemaVersion() int64 {
	if m != nil {
		return m.SavedModelSchemaVersion
	}
	return 0
}

func (m *SavedModel) GetMetaGraphs() []*MetaGraphDef {
	if m != nil {
		return m.MetaGraphs
	}
	return nil
}

func init() {
	proto.RegisterType((*SavedModel)(nil), "tensorflow.SavedModel")
}

func init() {
	proto.RegisterFile("tensorflow/core/protobuf/saved_model.proto", fileDescriptor_537826d0bcc2f334)
}

var fileDescriptor_537826d0bcc2f334 = []byte{
	// 228 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0xd2, 0x2a, 0x49, 0xcd, 0x2b,
	0xce, 0x2f, 0x4a, 0xcb, 0xc9, 0x2f, 0xd7, 0x4f, 0xce, 0x2f, 0x4a, 0xd5, 0x2f, 0x28, 0xca, 0x2f,
	0xc9, 0x4f, 0x2a, 0x4d, 0xd3, 0x2f, 0x4e, 0x2c, 0x4b, 0x4d, 0x89, 0xcf, 0xcd, 0x4f, 0x49, 0xcd,
	0xd1, 0x03, 0x0b, 0x0a, 0x71, 0x21, 0xd4, 0x4a, 0x69, 0xe2, 0xd4, 0x97, 0x9b, 0x5a, 0x92, 0x18,
	0x9f, 0x5e, 0x94, 0x58, 0x90, 0x01, 0xd1, 0xa6, 0xd4, 0xc2, 0xc8, 0xc5, 0x15, 0x0c, 0x32, 0xcc,
	0x17, 0x64, 0x96, 0x90, 0x35, 0x97, 0x14, 0x92, 0xd1, 0xf1, 0xc5, 0xc9, 0x19, 0xa9, 0xb9, 0x89,
	0xf1, 0x65, 0xa9, 0x45, 0xc5, 0x99, 0xf9, 0x79, 0x12, 0x8c, 0x0a, 0x8c, 0x1a, 0xcc, 0x41, 0xe2,
	0xc5, 0x70, 0xf5, 0xc1, 0x60, 0xf9, 0x30, 0x88, 0xb4, 0x90, 0x25, 0x17, 0x37, 0xc2, 0xfc, 0x62,
	0x09, 0x26, 0x05, 0x66, 0x0d, 0x6e, 0x23, 0x09, 0x3d, 0x84, 0x63, 0xf4, 0x7c, 0x53, 0x4b, 0x12,
	0xdd, 0x41, 0xb2, 0x2e, 0xa9, 0x69, 0x41, 0x5c, 0xb9, 0x30, 0x5e, 0xb1, 0x53, 0x3e, 0x97, 0x44,
	0x7e, 0x51, 0x3a, 0xb2, 0xd2, 0xb4, 0xa2, 0xc4, 0xdc, 0xd4, 0xf2, 0xfc, 0xa2, 0x6c, 0x27, 0x01,
	0x84, 0xfb, 0x02, 0x40, 0x6e, 0x2e, 0x0e, 0x60, 0x8c, 0xb2, 0x49, 0xcf, 0x2c, 0xc9, 0x28, 0x4d,
	0xd2, 0x4b, 0xce, 0xcf, 0xd5, 0x47, 0xf2, 0x2c, 0x76, 0x66, 0x7a, 0x3e, 0x6a, 0x28, 0xfc, 0x60,
	0x64, 0x4c, 0x62, 0x03, 0x73, 0x8c, 0x01, 0x01, 0x00, 0x00, 0xff, 0xff, 0x82, 0x52, 0xcf, 0x18,
	0x63, 0x01, 0x00, 0x00,
}