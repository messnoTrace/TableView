package com.notrace.tableview.toolkit;

import com.notrace.R;
import com.notrace.tableview.SortState;
import com.notrace.tableview.providers.SortStateViewProvider;



/**
 * A factory providing different implementations of the {@link SortStateViewProvider}.
 *
 * @author ISchwarz
 */
public class SortStateViewProviders {


    /**
     * Gives a {@link SortStateViewProvider} that will provide dark (transparent black) arrows.
     *
     * @return The described {@link SortStateViewProvider}.
     */
    public static SortStateViewProvider darkArrows() {
        return new DarkSortStateViewProvider();
    }

    /**
     * Gives a {@link SortStateViewProvider} that will provide bright (transparent white) arrows.
     *
     * @return The described {@link SortStateViewProvider}.
     */
    public static SortStateViewProvider brightArrows() {
        return new BrightSortStateViewProvider();
    }


    private static class DarkSortStateViewProvider implements SortStateViewProvider {

        @Override
        public int getSortStateViewResource(SortState state) {
            switch (state) {
                case SORTABLE:
                    return R.drawable.ic_dark_sortable;
                case SORTED_ASC:
                    return R.drawable.ic_dark_sorted_asc;
                case SORTED_DESC:
                    return R.drawable.ic_dark_sorted_desc;
                default:
                    return NO_IMAGE;
            }
        }
    }


    private static class BrightSortStateViewProvider implements SortStateViewProvider {

        @Override
        public int getSortStateViewResource(SortState state) {
            switch (state) {
                case SORTABLE:
                    return R.drawable.ic_light_sortable;
                case SORTED_ASC:
                    return R.drawable.ic_light_sorted_asc;
                case SORTED_DESC:
                    return R.drawable.ic_light_sorted_desc;
                default:
                    return NO_IMAGE;
            }
        }
    }

}
