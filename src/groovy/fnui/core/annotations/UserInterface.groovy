package fnui.core.annotations

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/**
 * The UserInterface annotation defines for Grails service the need to generate
 * an UI with (Fn)UI-toolchain.
 *
 * The second purpose of this annotation is, to embed information for the
 * toolchain to manipulate the generation process. Therefore a closure can
 * be defined as parameter of the annotation.
 *
 * If a service method is annotated with @UserInterface(ignore = true),
 * it will not be considered as an UI-functionality.
 *
 * Example:
 * @UserInterface({
 *     permissions = ['reg_user']
 *     something = false
 * })
 * class ...
 */
@Retention(RetentionPolicy.RUNTIME)
@interface UserInterface {
    /**
     * The value should be the class reference to a Closure which will be instantiated
     * without an context and the called. All non-local attribute-assignments
     * are collected for generation manipulation.
     */
    Class value() default {}

    /**
     * If set to true, the annotated element is ignored for UI generation
     */
    boolean ignore() default false
}
