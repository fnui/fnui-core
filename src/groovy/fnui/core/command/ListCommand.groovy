package fnui.core.command

import grails.validation.Validateable

/**
 * Command object for sortable, pageable list functionalities.
 */
@Validateable
class ListCommand {
    /**
     * offset in element listing
     */
    Integer offset = 0

    /**
     * maximum requested elements
     */
    Integer max = 25

    /**
     * order direction 'asc' or 'desc'
     */
    String order

    /**
     * sort by property name
     */
    String sort

    static constraints = {
        offset nullable: true
        max nullable: true
        order nullable: true, blank: true
        sort nullable: true, blank: true
    }

    Map<String,Object> createListParameter() {
        def params = [:]

        if (offset) params['offset'] = offset
        if (max) params['max'] = max
        if (sort) params['sort'] = sort
        if (order) params['order'] = order

        [offset:offset,max:max,sort:sort,order:order]
    }
}
