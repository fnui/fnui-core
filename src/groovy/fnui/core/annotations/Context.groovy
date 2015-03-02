package fnui.core.annotations

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/**
 * The Context annotation marks properties of an class which belongs to the explicit context of an functionality.
 */
@Retention(RetentionPolicy.RUNTIME)
@interface Context {
}