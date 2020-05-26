package scb.nextgen.dashboard.commons.date.util;

import java.time.*;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;


/**
 * The Class DateConvertersJSR310 is for LocalDateToDateConverter
 *
 * @author RUBIYA
 */
public final class DateConvertersJSR310 {
	 
	/**
	 * Instantiates a new date converters JSR 310.
	 */
	private DateConvertersJSR310() {}
	
    /**
     * The Class LocalDateToDateConverter.
     */
    public static class LocalDateToDateConverter implements Converter<LocalDate, Date> {

        /** The Constant INSTANCE. */
        public static final LocalDateToDateConverter INSTANCE = new LocalDateToDateConverter();

        /**
         * Instantiates a new local date to date converter.
         */
        private LocalDateToDateConverter() {}

        /**
         * Convert.
         *
         * @param source the source
         * @return the date
         */
        @Override
        public Date convert(LocalDate source) {
            return source == null ? null : Date.from(source.atStartOfDay(ZoneId.systemDefault()).toInstant());
        }
    }

    /**
     * The Class DateToLocalDateConverter.
     */
    public static class DateToLocalDateConverter implements Converter<Date, LocalDate> {
        
        /** The Constant INSTANCE. */
        public static final DateToLocalDateConverter INSTANCE = new DateToLocalDateConverter();
        
        /**
         * Instantiates a new date to local date converter.
         */
        private DateToLocalDateConverter() {}

        /**
         * Convert.
         *
         * @param source the source
         * @return the local date
         */
        @Override
        public LocalDate convert(Date source) {
            return source == null ? null : ZonedDateTime.ofInstant(source.toInstant(), ZoneId.systemDefault()).toLocalDate();
        }
    }

    /**
     * The Class ZonedDateTimeToDateConverter.
     */
    public static class ZonedDateTimeToDateConverter implements Converter<ZonedDateTime, Date> {
        
        /** The Constant INSTANCE. */
        public static final ZonedDateTimeToDateConverter INSTANCE = new ZonedDateTimeToDateConverter();
        
        /**
         * Instantiates a new zoned date time to date converter.
         */
        private ZonedDateTimeToDateConverter() {}

        /**
         * Convert.
         *
         * @param source the source
         * @return the date
         */
        @Override
        public Date convert(ZonedDateTime source) {
            return source == null ? null : Date.from(source.toInstant());
        }
    }

    /**
     * The Class DateToZonedDateTimeConverter.
     */
    public static class DateToZonedDateTimeConverter implements Converter<Date, ZonedDateTime> {
        
        /** The Constant INSTANCE. */
        public static final DateToZonedDateTimeConverter INSTANCE = new DateToZonedDateTimeConverter();
        
        /**
         * Instantiates a new date to zoned date time converter.
         */
        private DateToZonedDateTimeConverter() {}

        /**
         * Convert.
         *
         * @param source the source
         * @return the zoned date time
         */
        @Override
        public ZonedDateTime convert(Date source) {
            return source == null ? null : ZonedDateTime.ofInstant(source.toInstant(), ZoneId.systemDefault());
        }
    }

    /**
     * The Class LocalDateTimeToDateConverter.
     */
    public static class LocalDateTimeToDateConverter implements Converter<LocalDateTime, Date> {
        
        /** The Constant INSTANCE. */
        public static final LocalDateTimeToDateConverter INSTANCE = new LocalDateTimeToDateConverter();
        
        /**
         * Instantiates a new local date time to date converter.
         */
        private LocalDateTimeToDateConverter() {}

        /**
         * Convert.
         *
         * @param source the source
         * @return the date
         */
        @Override
        public Date convert(LocalDateTime source) {
            return source == null ? null : Date.from(source.atZone(ZoneId.systemDefault()).toInstant());
        }
    }

    /**
     * The Class DateToLocalDateTimeConverter.
     */
    public static class DateToLocalDateTimeConverter implements Converter<Date, LocalDateTime> {
        
        /** The Constant INSTANCE. */
        public static final DateToLocalDateTimeConverter INSTANCE = new DateToLocalDateTimeConverter();
        
        /**
         * Instantiates a new date to local date time converter.
         */
        private DateToLocalDateTimeConverter() {}

        /**
         * Convert.
         *
         * @param source the source
         * @return the local date time
         */
        @Override
        public LocalDateTime convert(Date source) {
            return source == null ? null : LocalDateTime.ofInstant(source.toInstant(), ZoneId.systemDefault());
        }
    }
}
