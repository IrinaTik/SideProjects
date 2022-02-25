package task.string;

public enum Brackets {
    ROUND_BEGIN('(') {
        public Brackets opposite() {
            return ROUND_END;
        }
    },
    ROUND_END(')') {
        public Brackets opposite() {
            return ROUND_BEGIN;
        }
    },
    SQUARE_BEGIN('[') {
        public Brackets opposite() {
            return SQUARE_END;
        }
    },
    SQUARE_END(']') {
        public Brackets opposite() {
            return SQUARE_BEGIN;
        }
    },
    CURVED_BEGIN('{') {
        public Brackets opposite() {
            return CURVED_END;
        }
    },
    CURVED_END('}') {
        public Brackets opposite() {
            return CURVED_BEGIN;
        }
    },
    NOT_FOUND('n') {
        public Brackets opposite() {
            return NOT_FOUND;
        }
    };

    public final char label;

    Brackets(char label) {
        this.label = label;
    }

    public abstract Brackets opposite();

    public static Brackets fromValue(char value) {
        for (final Brackets bracket : values()) {
            if (bracket.label == value) {
                return bracket;
            }
        }
        return NOT_FOUND;
    }
}
