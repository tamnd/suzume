# suzume release rules. Filled out fully at M10; this is the starter set.

# kotlinx.serialization keeps generated serializers.
-keepattributes *Annotation*, InnerClasses
-dontnote kotlinx.serialization.**
-keepclassmembers class **$$serializer { *; }
-keepclasseswithmembers class * {
    kotlinx.serialization.KSerializer serializer(...);
}

# Room entities and generated DAOs are referenced reflectively.
-keep class * extends androidx.room.RoomDatabase { <init>(); }
-keepclassmembers class * { @androidx.room.* <methods>; }
