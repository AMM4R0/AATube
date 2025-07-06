package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.mf */
/* loaded from: classes.dex */
public final class C2023mf implements ProtobufStateStorage {

    /* renamed from: a */
    public final String f6761a;

    /* renamed from: b */
    public final IBinaryDataHelper f6762b;

    /* renamed from: c */
    public final ProtobufStateSerializer f6763c;

    /* renamed from: d */
    public final ProtobufConverter f6764d;

    public C2023mf(String str, IBinaryDataHelper iBinaryDataHelper, ProtobufStateSerializer<MessageNano> protobufStateSerializer, ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.f6761a = str;
        this.f6762b = iBinaryDataHelper;
        this.f6763c = protobufStateSerializer;
        this.f6764d = protobufConverter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.f6762b.remove(this.f6761a);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final Object read() {
        try {
            byte[] bArr = this.f6762b.get(this.f6761a);
            if (bArr != null && bArr.length != 0) {
                return this.f6764d.toModel(this.f6763c.toState(bArr));
            }
            return this.f6764d.toModel(this.f6763c.defaultValue());
        } catch (Throwable unused) {
            return this.f6764d.toModel(this.f6763c.defaultValue());
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(Object obj) {
        this.f6762b.insert(this.f6761a, this.f6763c.toByteArray(this.f6764d.fromModel(obj)));
    }
}
