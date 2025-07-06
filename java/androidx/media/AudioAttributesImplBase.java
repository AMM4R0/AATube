package androidx.media;

import java.util.Arrays;
import p000A.AbstractC0002c;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f2442a = 0;

    /* renamed from: b */
    public int f2443b = 0;

    /* renamed from: c */
    public int f2444c = 0;

    /* renamed from: d */
    public int f2445d = -1;

    public final boolean equals(Object obj) {
        int r6;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f2443b == audioAttributesImplBase.f2443b) {
            int r2 = this.f2444c;
            int r4 = audioAttributesImplBase.f2444c;
            int r5 = audioAttributesImplBase.f2445d;
            if (r5 == -1) {
                int r62 = audioAttributesImplBase.f2442a;
                int r9 = AudioAttributesCompat.f2438b;
                if ((r4 & 1) != 1) {
                    if ((r4 & 4) != 4) {
                        switch (r62) {
                            case 2:
                                r6 = 0;
                                break;
                            case 3:
                                r6 = 8;
                                break;
                            case 4:
                                r6 = 4;
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                r6 = 5;
                                break;
                            case 6:
                                r6 = 2;
                                break;
                            case 11:
                                r6 = 10;
                                break;
                            case 12:
                            default:
                                r6 = 3;
                                break;
                            case 13:
                                r6 = 1;
                                break;
                        }
                    } else {
                        r6 = 6;
                    }
                } else {
                    r6 = 7;
                }
            } else {
                r6 = r5;
            }
            if (r6 == 6) {
                r4 |= 4;
            } else if (r6 == 7) {
                r4 |= 1;
            }
            if (r2 == (r4 & 273) && this.f2442a == audioAttributesImplBase.f2442a && this.f2445d == r5) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2443b), Integer.valueOf(this.f2444c), Integer.valueOf(this.f2442a), Integer.valueOf(this.f2445d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f2445d != -1) {
            sb.append(" stream=");
            sb.append(this.f2445d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int r12 = this.f2442a;
        int r2 = AudioAttributesCompat.f2438b;
        switch (r12) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = AbstractC0002c.m11f(r12, "unknown usage ");
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f2443b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f2444c).toUpperCase());
        return sb.toString();
    }
}
