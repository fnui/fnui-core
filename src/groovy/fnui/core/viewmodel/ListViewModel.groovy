package fnui.core.viewmodel

import fnui.core.command.ListCommand

/**
 *
 *
 * @param < T > element type for the list
 */
class ListViewModel<T> extends ListCommand {
    /**
     * data object collection
     */
    List<T> listData

    /**
     * total available data objects
     */
    Integer totalCount

    ListViewModel(List<T> list, Integer total, ListCommand listCommand) {
        listData = list
        totalCount = total
        offset = listCommand.offset
        max = listCommand.max
        sort = listCommand.sort
        order = listCommand.order
    }
}
