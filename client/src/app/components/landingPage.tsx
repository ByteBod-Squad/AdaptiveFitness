import Image from 'next/image';
import Header from './Header';
import Link from 'next/link';

const Section = () => {
  return (
    <section className="flex flex-col h-[82%] bg-primary w-full p-8 text-secondary items-center justify-center">
      <div className="flex flex-col gap-12 text-center">
        <div>
          <h1 className="text-4xl p-2">Text will go here</h1>

          <h2 className="text-2xl p-2">Message/description of the product</h2>
        </div>
        <div>
          <Link href={'/input'}>
            <button className="bg-tertiary px-4 py-2 rounded-lg active:bg-tertiary/70">
              Create workout
            </button>
          </Link>
        </div>
      </div>
    </section>
  );
};

export default Section;
